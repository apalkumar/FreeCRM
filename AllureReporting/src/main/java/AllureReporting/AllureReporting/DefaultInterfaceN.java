package AllureReporting.AllureReporting;

public interface DefaultInterfaceN {
	void sleep();
    default void run() {
        System.out.println("I'm running!");
    }
}
