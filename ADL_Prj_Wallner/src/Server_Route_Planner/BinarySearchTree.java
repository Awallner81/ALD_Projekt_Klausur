package Server_Route_Planner;

public class BinarySearchTree extends Ort {
	
	  public Node root;
	    public class Node{
	        public Ort orte;
	        public Node left, right;
			public String data;

	    public Node(Ort orte)
	    {
	        this.orte = orte;
	       
	        }
	    }

	    public BinarySearchTree()
	    /**
	     * constructor to initialize the internal binary search tree. 
	     * The data element should be an object of the type Orte, described above.
	     */
	    {   
	        super(0,  "");

	    }

	    public Ort findExact(String key) {
	    return findExact(root, key);
	}

	private Ort findExact(Node x, String key) {
	    if (x == null) return null;
	    int cmp = key.compareToIgnoreCase(x.orte.name);
	    if      (cmp < 0) return findExact(x.left, key);
	    else if (cmp > 0) return findExact(x.right, key);
	    else              return x.orte;
	}

	    public void insert(Ort data)
	    {
	        if (data == null) {return; }
	        root = insert(root, data);
	    }

	    public Node insert(Node x, Ort data)
	    {   
	        if (x == null) return new Node(data);
	        int cmp = data.id - x.orte.id;
	        if (cmp > 0 )       x.right = insert(x.right, data);
	        else if (cmp < 0)   x.left = insert(x.left, data);
	        else if (cmp == 0)  x.orte = data;
	        return x;
	    }
	    
	    
	    public void display(Node root){
	   		if(root!=null){
	   			display(root.left);
	   			System.out.print(" " + root.data);
	   			display(root.right);
	   		}
	}
}
  

