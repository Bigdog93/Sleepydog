package sec06.ch07;

public interface MyList {
	void add(int value); // public abstract static
	void add(int index, int value);
	int remove(int index);
	int remove();
	int size();
	int get(int index);
	void printAll();
	
}
