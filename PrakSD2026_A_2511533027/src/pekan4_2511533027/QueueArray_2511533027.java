package pekan4_2511533027;

public class QueueArray_2511533027 {
	int front_3027, rear_3027, size_3027;
	int capacity_3027;
	int array_3027[];
	
	public QueueArray_2511533027(int capacity) {
		this.capacity_3027 = capacity;
		front_3027 = this.size_3027 = 0;
		rear_3027 = capacity - 1;
		array_3027 = new int[this.capacity_3027];
	}
	
	boolean isFull_3027(QueueArray_2511533027 queue) {
		return (queue.size_3027 == queue.capacity_3027);
	}
	
	boolean isEmpty_3027(QueueArray_2511533027 queue) {
		return (queue.size_3027 == 0);
	}
	
	void enqueue_3027(int item) {
		if (isFull_3027(this))
			return;
		this.rear_3027 = (this.rear_3027 + 1) % this.capacity_3027;
		this.array_3027[this.rear_3027] = item;
		this.size_3027 = this.size_3027 + 1;
		 System.out.println(item + " enqueued to queue");
	}
	
	int dequeue_3027() {
		if (isEmpty_3027(this))
			return Integer.MIN_VALUE;
		int item_3027 = this.array_3027[this.front_3027];
		this.front_3027 = (this.front_3027 + 1) % this.capacity_3027;
		this.size_3027 = this.size_3027 - 1;
		return item_3027;
	}
	
	int front_3027() {
		if (isEmpty_3027(this))
			return Integer.MIN_VALUE;
		return this.array_3027[this.front_3027];
	}
	
	int rear_3027() {
		if (isEmpty_3027(this))
			return Integer.MIN_VALUE;
		return this.array_3027[this.rear_3027];
	}
	
		// mencetak elemen antrian
	void display() {
		int i;
		if (front_3027 == rear_3027) {
			 System.out.printf("\nAntrian Kosong\n");
			 return;
		}
		
		//kunjungi dari belakang dan cetak
		for (i = front_3027; i < rear_3027; i++) {
			 System.out.printf(" %d <-- ", array_3027[i]);
		}
		return;
	}
	
}
