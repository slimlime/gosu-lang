/*
 * Copyright 2014 Guidewire Software, Inc.
 */

package gw.lang.function;

@FunctionalInterface
public interface IFunction5<R, P0, P1, P2, P3, P4> {

  R invoke(P0 arg0, P1 arg1, P2 arg2, P3 arg3, P4 arg4);

}
