class RandomizedSet {

    HashSet<Integer> hashset; 
    ArrayList<Integer> arr;
    public RandomizedSet() {
        hashset = new HashSet<Integer>();  
        arr = new ArrayList<Integer>();
    }
    
    public boolean insert(int val) {
        if(hashset.contains(val)){
            return false;
        }
        hashset.add(val);
        arr.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if(!hashset.contains(val)){
            return false;
        }
        hashset.remove(val);
        arr.remove(Integer.valueOf(val));
        return true;
    }
    
    public int getRandom() {
        Integer index=new Random().nextInt(arr.size());
        return arr.get(index);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */