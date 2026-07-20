// Last updated: 20/07/2026, 21:27:50
1public class TimeMap {
2
3    private Map<String, List<Pair<Integer, String>>> keyStore;
4
5    public TimeMap() {
6        keyStore = new HashMap<>();
7    }
8
9    public void set(String key, String value, int timestamp) {
10        keyStore.computeIfAbsent(key, k -> new ArrayList<>()).add(new Pair<>(timestamp, value));
11    }
12
13    public String get(String key, int timestamp) {
14        List<Pair<Integer, String>> values = keyStore.getOrDefault(key, new ArrayList<>());
15        int left = 0, right = values.size() - 1;
16        String result = "";
17
18        while (left <= right) {
19            int mid = left + (right - left) / 2;
20            if (values.get(mid).getKey() <= timestamp) {
21                result = values.get(mid).getValue();
22                left = mid + 1;
23            } else {
24                right = mid - 1;
25            }
26        }
27
28        return result;
29    }
30
31    private static class Pair<K, V> {
32        private final K key;
33        private final V value;
34
35        public Pair(K key, V value) {
36            this.key = key;
37            this.value = value;
38        }
39
40        public K getKey() {
41            return key;
42        }
43
44        public V getValue() {
45            return value;
46        }
47    }
48}