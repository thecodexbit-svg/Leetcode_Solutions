class FreqStack {
    public HashMap<Integer , Stack<Integer>> stmap;
    public HashMap<Integer , Integer> fremap;
    public int maxFre = 0;
    public FreqStack() {
        stmap = new HashMap<>();
        fremap = new HashMap<>();
    }
    
    public void push(int val) {
        if(fremap.containsKey(val)){
            fremap.put(val , fremap.get(val)+1);
        }else{
            fremap.put(val , 1);
        }
        int fre = fremap.get(val);
        if(stmap.containsKey(fre)){
            stmap.get(fre).push(val);
        }else{
            stmap.put(fre , new Stack<>());
            stmap.get(fre).push(val);
        }
        maxFre = Math.max(maxFre , fre);
    }
    
    public int pop() {
        int n = stmap.get(maxFre).pop();
        fremap.put(n , fremap.get(n)-1);
        if(stmap.get(maxFre).isEmpty()){
            stmap.remove(maxFre);
            maxFre--;
        }
        return n;
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */