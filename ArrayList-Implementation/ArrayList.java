class CustomArrayList {
    Object[] arr;
    int lastindex = -1;

    CustomArrayList() {
        arr = new Object[10];
    }

    CustomArrayList(int n) {
        arr = new Object[n];
    }

    protected void add(Object a) {
        if (lastindex + 1 == arr.length) {
            resize();
        }
        arr[++lastindex] = a;
    }

    protected int size() {
        return lastindex != -1 ? lastindex + 1 : 0;
    }

    protected Object get(int index){
        if(index>=0 && index<=lastindex){
            return arr[index];
        }
        return new String("Invalid Syntax");
    }

    private void resize() {
        Object[] newArr = new Object[arr.length * 2];
        for (int i = 0; i <= lastindex; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }
}
