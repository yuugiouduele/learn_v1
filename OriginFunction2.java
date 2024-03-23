package exam;
@FunctionalInterface
interface OriginFunction2<T,K,A,B> {
	void foo(T t,K k,A a,B b);
	String toString();
	boolean equals(Object obj);
	static void X() {};
	default void Y() {};
}
