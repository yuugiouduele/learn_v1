package exam;
@FunctionalInterface
interface OriginFunction1<T> {
	void foo(T t);
	String toString();
	boolean equals(Object obj);
	static void X() {};
	default void Y() {};
}
