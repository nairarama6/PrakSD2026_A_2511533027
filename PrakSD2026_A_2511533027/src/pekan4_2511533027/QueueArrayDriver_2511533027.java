package pekan4_2511533027;

public class QueueArrayDriver_2511533027 {

	public static void main(String[] args) {
		QueueArray_2511533027 queue_3027 = new QueueArray_2511533027(1000);
		queue_3027.enqueue_3027(10);
		queue_3027.enqueue_3027(20);
		queue_3027.enqueue_3027(30);
		queue_3027.enqueue_3027(40);
		System.out.println("Item di depan "+ queue_3027.front_3027());
		System.out.println("Item paling belakang " + queue_3027.rear_3027());
		System.out.println("tampilan queue");
		queue_3027.display();
		System.out.println();
		System.out.println(queue_3027.dequeue_3027() + " dihapus dari queue");
		System.out.println("Item di depan:" + queue_3027.front_3027());
		System.out.println("Item dibelakang: " + queue_3027.rear_3027());
		System.out.println("Tampilan queue setelah satu data dihapus");
		queue_3027.display();
	}

}
