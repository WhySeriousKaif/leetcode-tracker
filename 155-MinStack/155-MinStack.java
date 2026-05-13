// Last updated: 13/05/2026, 19:12:35
1class MinStack {
2    Stack<Integer> st;
3    Stack<Integer> minStack;
4
5    public MinStack() {
6        st = new Stack<>();
7        minStack = new Stack<>();
8
9    }
10
11    public void push(int val) {
12        st.add(val);
13        if (minStack.isEmpty() || val <= minStack.peek()) {
14            minStack.add(val);
15        }
16
17    }
18
19    public void pop() {
20        if (st.isEmpty())
21            return;
22
23        // Use .equals() for reliable object value comparison
24        if (st.pop().equals(minStack.peek())) {
25            minStack.pop();
26        }
27    }
28
29    public int top() {
30        return st.peek();
31
32    }
33
34    public int getMin() {
35
36        return minStack.peek();
37
38    }
39}
40
41/**
42 * Your MinStack object will be instantiated and called as such:
43 * MinStack obj = new MinStack();
44 * obj.push(val);
45 * obj.pop();
46 * int param_3 = obj.top();
47 * int param_4 = obj.getMin();
48 */