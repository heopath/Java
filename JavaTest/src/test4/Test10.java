package test4;

class Computer {
	
	private String model;

	public Computer(String model) {
		this.model = model;
	}

	public void show() {
		System.out.println("모델: " + model);
	}

	static class CPU {
		String processor;
		
		public CPU(String processor) {
			this.processor = processor;
		}
		
		public void info() {
			System.out.println("CPU: " + processor);
		}
	}

	static class RAM {
		int size;
		
		public RAM(int size) {
			this.size = size;
		}
		
		public void info() {
			System.out.println("RAM: " + size + "GB");
		}
	}

	static class SSD {
		int storage;
		
		public SSD(int storage) {
			this.storage = storage;
		}
		
		public void info() {
			System.out.println("SSD: " + storage + "GB");
		}
	}
}

public class Test10 {
	public static void main(String[] args) {
		Computer.CPU cpu = new Computer.CPU("Intel i7");
		Computer.RAM ram = new Computer.RAM(64);
		Computer.SSD ssd = new Computer.SSD(1024);
		
		cpu.info();
		ram.info();
		ssd.info();
	}
}