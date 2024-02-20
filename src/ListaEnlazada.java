public class ListaEnlazada {
    private static class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

        public ListaEnlazada() {
            head = null;
        }

        public boolean isEmpty() {
            return head == null;
        }

        public void insertarInicio(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                newNode.next = head;
            } else {
                Node temp = head;
                while (temp.next != head) {
                    temp = temp.next;
                }
                temp.next = newNode;
                newNode.next = head;
                head = newNode;
            }
        }

        public void insertarFinal(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                newNode.next = head;
            } else {
                Node temp = head;
                while (temp.next != head) {
                    temp = temp.next;
                }
                temp.next = newNode;
                newNode.next = head;
            }
        }

        public Node encontrar(int data) {
            if (isEmpty()) {
                return null;
            }

            Node current = head;
            do {
                if (current.data == data) {
                    return current;
                }
                current = current.next;
            } while (current != head);

            return null;
        }

        public boolean eliminar(int data) {
            if (isEmpty()) {
                return false;
            }

            Node current = head;
            Node previous = null;
            while (current.data != data) {
                if (current.next == head) {
                    return false;
                }
                previous = current;
                current = current.next;
            }

            if (current == head) {
                Node temp = head;
                while (temp.next != head) {
                    temp = temp.next;
                }
                if (head == head.next) {
                    head = null;
                } else {
                    head = head.next;
                    temp.next = head;
                }
            } else if (current.next == head) {
                previous.next = head;
            } else {
                previous.next = current.next;
            }

            return true;
        }

        public void mostrarLista() {
            if (isEmpty()) {
                System.out.println("La lista está vacía");
                return;
            }

            Node current = head;
            do {
                System.out.print(current.data + " ");
                current = current.next;
            } while (current != head);
            System.out.println();
        }
    }

