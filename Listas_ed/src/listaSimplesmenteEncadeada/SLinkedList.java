package listaSimplesmenteEncadeada;

//Lista simplesmente encadeada

public class SLinkedList {

protected Node head; // nodo cabeça da lista

protected Node tail; // nodo cabeça da lista

protected long size; // número de nodos da lista

//Construtor default que cria uma lista vazia

public SLinkedList() {

head = tail = null;

size = 0;

}



public String  toString(){
	String s;
	Node p = head;
	s="[";
	while( p!=null) {
		s+=p.getElement();
		s+=", ";
		p = p.getNext();	
	}
	if(s.length() > 1) s = s.substring(0,s.length() - 2);
	return s + "]";
}



public void addHead(String element) {
	Node v  = new Node(element,head);
	if (size == 0) tail = v;
	head = v;
	size++;
	
	
}



public void addTail(String element) {
	Node v  = new Node(element,null);
	if (size == 0) {
	head =tail =  v;
	} else {
		tail.setNext(v);
		tail = v;
	}
	size++;
}



public void removeFirst() {
	Node t;
	t = head;
	head = t.getNext();
	t.setNext(null);
	size --;
}



//... A implementação das interfaces vão aqui ...

}