package visitor;

import nodos.*;

public class GenCodeVisitor  implements Visitor {
	public Object visit(Programa programa, Object param) {
		for (Sentencia sentencia:programa.sentencias)
			sentencia.accept(this, null);
		return null;
	}

	public Object visit(Read read, Object param) {
		read.var.accept(this, "Izq");
		System.out.println("input\nstore");
		return null;
	}

	public Object visit(Asignacion asigna, Object param) {
		asigna.variable.accept(this, "Izq");
		asigna.expr.accept(this, null);
		System.out.println("store");
		return null;
	}

	public Object visit(Print print, Object param) {
		print.expr.accept(this, null);
		System.out.println("output");
		return null;
	}

	public Object visit(ConstanteInt cte, Object param) {
		System.out.println("pushc " + cte.valor);
		return null;
	}

	public Object visit(Variable refVar, Object param) {
		System.out.println("pushv "+refVar.name);
		if ((String) param != "Izq")
			System.out.println("load");
		return null;
	}

	public Object visit(Suma suma, Object param) {
		suma.left.accept(this, null);
		suma.right.accept(this, null);
		System.out.println("add");
		return null;
	}

	public Object visit(Producto prod, Object param) {
		prod.left.accept(this, null);
		prod.right.accept(this, null);
		System.out.println("mul");
		return null;
	}

	public Object visit(Division div, Object param) {
		div.left.accept(this, null);
		div.right.accept(this, null);
		System.out.println("div");
		return null;
	}
}

