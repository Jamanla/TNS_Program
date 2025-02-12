package multithreaddingdemo;

public class Eclipse extends Thread {
	public void run() {
		System.out.println("eclipse"+Thread.currentThread().getId());
	}

}

class Notepad extends Thread{
	public void run() {
		System.out.println("Notepad"+Thread.currentThread().getId());
}
}
class Chrome extends Thread{
	public void run() {
		System.out.println("Chraom"+Thread.currentThread().getId());
}
}
