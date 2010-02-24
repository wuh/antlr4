package org.antlr.v4.automata;

import org.antlr.v4.tool.Grammar;
import org.antlr.v4.tool.GrammarAST;

public class ActionTransition extends NFATransition {
	public GrammarAST actionAST;

	public ActionTransition(GrammarAST actionAST) {
		this.actionAST = actionAST;
	}

	public boolean isEpsilon() {
		return true; // we are to be ignored by analysis 'cept for predicates
	}

	public int compareTo(Object o) {
		return 0;
	}

	public String toString() {
		return "{"+actionAST+"}";
	}

	public String toString(Grammar g) {
		return toString();
	}
}