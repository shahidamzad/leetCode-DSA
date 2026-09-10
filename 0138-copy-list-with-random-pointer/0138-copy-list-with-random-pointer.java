class Solution {

    // Step 1: Create Deep Copy
    public Node DeepCopy(Node head) {

        Node head2 = new Node(head.val);

        Node t1 = head.next;
        Node t2 = head2;

        while (t1 != null) {

            Node temp = new Node(t1.val);

            t2.next = temp;
            t2 = t2.next;

            t1 = t1.next;
        }

        return head2;
    }


    // Step 2: Interleave Original and Copy
    public void ConnectAlternatively(Node head, Node head2) {

        Node t1 = head;
        Node t2 = head2;

        while (t1 != null) {

            // Save next nodes
            Node next1 = t1.next;
            Node next2 = t2.next;

            // Original → Copy
            t1.next = t2;

            // Copy → Original next
            t2.next = next1;

            // Move forward
            t1 = next1;
            t2 = next2;
        }
    }


    // Step 3: Assign Random Pointers
    public void assignRandom(Node head, Node head2) {

        Node t1 = head;

        while (t1 != null) {

            Node t2 = t1.next;

            if (t1.random != null) {
                t2.random = t1.random.next;
            }

            t1 = t2.next;
        }
    }


    // Step 4: Separate the two lists
    public void Split(Node head, Node head2) {

        Node t1 = head;
        Node t2 = head2;

        while (t1 != null) {

            t1.next = t2.next;
            t1 = t1.next;

            if (t1 == null)
                break;

            t2.next = t1.next;
            t2 = t2.next;
        }
    }


    public Node copyRandomList(Node head) {

        if (head == null)
            return null;

        // Step 1
        Node head2 = DeepCopy(head);

        // Step 2
        ConnectAlternatively(head, head2);

        // Step 3
        assignRandom(head, head2);

        // Step 4
        Split(head, head2);

        return head2;
    }
}