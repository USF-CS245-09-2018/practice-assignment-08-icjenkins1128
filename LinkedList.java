

public class LinkedList implements List{

	// public static void main(String[] args){

	// 	String [] movies = {"The Adventures of Robin Hood", "Au revoir les enfants",
	// 			"Back to the Future", "Beauty and the Beast", "Bicycle Thieves",
	// 			"Billy Elliot", "A Day at the Races", "E.T. the Extra-Terrestrial",
	// 			"Edward Scissorhands", "Etre et Avoir", "Finding Nemo", "It's a Wonderful Life",
	// 			"Jason and the Argonauts", "Kes", "The Kid", "King Kong", "Kirikou et la sorciere",
	// 			"La Belle et la Bete", "Le Voyage dans la Lune", "The 400 Blows",
	// 			"Monsieur Hulot's Holiday", "My Life as a Dog", "My Neighbour Totoro",
	// 			"The Night of the Hunter", "Oliver Twist", "The Outsiders", "Pather Panchali",
	// 			"Playtime", "The Princess Bride", "Rabbit-Proof Fence", "Raiders of the Lost Ark",
	// 			"The Railway Children", "The Red Balloon", "Romeo + Juliet", "The Secret Garden",
	// 			"Show Me Love", "Singin' in the Rain", "Snow White and the Seven Dwarfs",
	// 			"Some Like It Hot", "The Spirit of the Beehive", "Spirited Away", "Star Wars",
	// 			"To Kill a Mockingbird", "Toy Story", "Walkabout", "Whale Rider", 
	// 			"Where Is the Friend's Home?", "Whistle Down the Wind", "The White Balloon",
	// 			"The Wizard of Oz"};
	// 	try {
	// 		LinkedList list = new LinkedList();
			
	// 		for (int i = 0; i < movies.length; i++) {
	// 			list.add(i, movies[i]);
	// 		}
			
	// 		System.out.println(list.size());
	// 		System.out.println(movies.length);
	// 		System.out.println(list.get(41));
	// 		System.out.println(movies[41]);

	// 		if(list.get(41).equals(movies[41])){
	// 			System.out.println("yes");
	// 		}

	// 		if (list.size() == movies.length && list.get(41).equals(movies[41])) {
	// 			// First movie I saw!
	// 			printList(list);
	// 		}
	// 		System.out.println("False1");
	// 	} catch (Exception e) {
	// 		System.out.println("False2");
	// 	}

		


	// }

	//Inner node class
	public class Node { 
  
        Object data; 
        Node next; 
  
        // Constructor 
        public Node() 
        { 
            this.data = null; 
            this.next = null; 
        } 

        public Object getData() {

        	return this.data;
        }

         public Node getNext() {

        	return this.next;
        }

        public void setData(Object obj) {

        	this.data = obj;

        }

         public void setNext(Node n) {

        	this.next = n;

        }


    } 

    public Node head;
	public int size;



	public LinkedList () {

		head = null;
		size = 0;

	}

	public void add(Object obj) throws Exception{

		
			Node node = new Node();
			node.setData(obj);
			node.setNext(head);
			head = node;
			++size;


	}


	public void add(int pos, Object obj) throws Exception{

		if(pos == 0){

			Node node = new Node();
			node.setData(obj);
			node.setNext(head);
			head = node;
			

		}

		Node previous = getNode(pos - 1);
		Node node = new Node();
		node.setData(obj);
		Node next = previous.next;
		previous.setNext(node);
		++size;
	}


	public Object get(int pos) throws Exception {

		Node node = getNode(pos);

		return node.data;
	}

	public Node getNode(int pos) throws Exception {

		Node node = head;


		for(int i = 0; i < pos ; i++){
			node = node.getNext();
		}


		return node;
	}

	public Object remove(int pos) throws Exception{

		if(pos < 0){

			throw new IndexOutOfBoundsException();

		}


		if(pos == 0){

			Node curr = head;
			head = head.getNext();
			--size;

			return curr.getData();

		}else{

			Node previous = getNode(pos - 1);
			Node curr = previous.next;
			previous.next = curr.next;
			--size;

			return curr.data;

		}

	}
	public void printList(LinkedList list) 
    { 
        Node currNode = list.head; 
   
        System.out.print("LinkedList: "); 
   
        
        while (currNode != null) { 
         
            System.out.print(currNode.data + " "); 
   
            
            currNode = currNode.next; 
        } 
    } 
   

	public int size() 
	{
		return size;
	}
}