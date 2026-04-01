// Last updated: 01/04/2026, 15:30:54
1import java.util.*;
2
3class LRUCache {
4
5    class Node {
6        int key, value;
7        Node prev, next;
8
9        Node(int key, int value) {
10            this.key = key;
11            this.value = value;
12        }
13    }
14
15    private int capacity;
16    private Map<Integer, Node> map;
17
18    private Node head, tail;
19
20    public LRUCache(int capacity) {
21        this.capacity = capacity;
22        this.map = new HashMap<>();
23
24        // Dummy nodes (important trick)
25        head = new Node(0, 0);
26        tail = new Node(0, 0);
27
28        head.next = tail;
29        tail.prev = head;
30    }
31
32    // Remove node from DLL
33    private void remove(Node node) {
34        node.prev.next = node.next;
35        node.next.prev = node.prev;
36    }
37
38    // Insert node right after head (most recent)
39    private void insert(Node node) {
40        node.next = head.next;
41        node.prev = head;
42
43        head.next.prev = node;
44        head.next = node;
45    }
46
47    public int get(int key) {
48        if (!map.containsKey(key)) return -1;
49
50        Node node = map.get(key);
51
52        remove(node);   // remove from current position
53        insert(node);   // move to front
54
55        return node.value;
56    }
57
58    public void put(int key, int value) {
59        if (map.containsKey(key)) {
60            Node existing = map.get(key);
61            remove(existing);
62        }
63
64        Node node = new Node(key, value);
65        insert(node);
66        map.put(key, node);
67
68        if (map.size() > capacity) {
69            Node lru = tail.prev; // least recently used
70            remove(lru);
71            map.remove(lru.key);
72        }
73    }
74}