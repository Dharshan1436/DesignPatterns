package designPattrens;

interface Chair {
	void create();
}

interface Table {
	void create();
}

class VictorianChair implements Chair {
	public void create() {
		System.out.println("Victorian Chair created.");
	}
}

class ModernChair implements Chair {
	public void create() {
		System.out.println("Modern Chair created.");
	}
}

class VictorianTable implements Table {
	public void create() {
		System.out.println("Victorian Table created.");
	}
}

class ModernTable implements Table {
	public void create() {
		System.out.println("Modern Table created.");
	}
}


interface FurnitureFactory {
	Chair createChair();
	Table createTable();
}

class VictorianFurnitureFactory implements FurnitureFactory {
	public Chair createChair() {
		return new VictorianChair();
	}

	public Table createTable() {
		return new VictorianTable();
	}
}

class ModernFurnitureFactory implements FurnitureFactory {
	public Chair createChair() {
		return new ModernChair();
	}

	public Table createTable() {
		return new ModernTable();
	}
}

public class AbstractFactoryDesignMain {
	public static void main(String[] args) {
		
		FurnitureFactory victorianFactory = new VictorianFurnitureFactory();
		Chair victorianChair = victorianFactory.createChair();
		Table victorianTable = victorianFactory.createTable();
		victorianChair.create();
		victorianTable.create();

		
		FurnitureFactory modernFactory = new ModernFurnitureFactory();
		Chair modernChair = modernFactory.createChair();
		Table modernTable = modernFactory.createTable();
		modernChair.create();
		modernTable.create();
	}
}
