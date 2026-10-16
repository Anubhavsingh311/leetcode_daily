// Title: Insert Delete GetRandom O(1)
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/insert-delete-getrandom-o(1)/

    
    public boolean remove(int val) {
        if (!map.containsKey(val)) return false;
        
        int index = map.get(val);
        int lastElement = list.get(list.size() - 1);
        list.add(val);
        return true;
    }
        if (map.containsKey(val)) return false;
        map.put(val, list.size());
        
        list.set(index, lastElement);
        map.put(lastElement, index);
        
        list.remove(list.size() - 1);
        map.remove(val);
        
        return true;
    }
    
    public int getRandom() {
        return list.get(rand.nextInt(list.size()));
