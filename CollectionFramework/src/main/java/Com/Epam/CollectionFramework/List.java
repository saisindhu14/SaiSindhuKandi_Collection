package Com.Epam.CollectionFramework;
import java.util.Arrays;
public class List<A> {
	private int n = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object val[];
    public List(){
        val = new Object[DEFAULT_CAPACITY];
    }
    public int size() {
        return n;
    }
    public void add(A e){
        val[n++] = e;
    }
    @SuppressWarnings("unchecked")
    public A get(int i){
        if (i >= n || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (A) val[i];
    }
    @SuppressWarnings("unchecked")
    public A remove(int i) {
        if (i >= n || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        Object item = val[i];
        int numElts = val.length - ( i + 1 ) ;
        System.arraycopy(val, i + 1, val, i, numElts) ;
        n--;
        return (A) item;
    }
    public void clear(){
    	Object item;
    	if (n != 0) {
    		while(n > 0){
    			n--;
    		}
    	}
    }
    @Override
    public String toString() {
         StringBuilder sb = new StringBuilder();
         sb.append('[');
         for(int i = 0; i < n ;i++) {
             sb.append(val[i].toString());
             if(i<n-1){
                 sb.append(",");
             }
         }
         sb.append(']');
         return sb.toString();
    }
}