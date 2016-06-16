package Server_Route_Planner;

public class BinarySearchTree extends Orte {
	
	  public Node root;
	    public class Node{
	        public Orte orte;
	        public Node left, right;

	    public Node(Orte orte)
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

	    public Orte findExact(String key) {
	    return findExact(root, key);
	}

	private Orte findExact(Node x, String key) {
	    if (x == null) return null;
	    int cmp = key.compareToIgnoreCase(x.orte.name);
	    if      (cmp < 0) return findExact(x.left, key);
	    else if (cmp > 0) return findExact(x.right, key);
	    else              return x.orte;
	}

	    public void insert(Orte data)
	    {
	        if (data == null) {return; }
	        root = insert(root, data);
	    }

	    public Node insert(Node x, Orte data)
	    {   
	        if (x == null) return new Node(data);
	        int cmp = data.id - x.orte.id;
	        if (cmp > 0 )       x.right = insert(x.right, data);
	        else if (cmp < 0)   x.left = insert(x.left, data);
	        else if (cmp == 0)  x.orte = data;
	        return x;
	    }
	}
  

