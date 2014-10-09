public class BinaryNode{
	// elementos en el �rbol
		Comparable element;      
        BinaryNode left;        
        BinaryNode right;       
        
        /**
         * post: se hace un nodo nuevo con hijos vac�os
         * @param theElement 
         */
        BinaryNode( Comparable theElement )
        {
            this( theElement, null, null );
        }
        /**
         * 
         * @param theElement
         * @param lt
         * @param rt 
         */
        BinaryNode( Comparable theElement, BinaryNode lt, BinaryNode rt )
        {
            element  = theElement;
            left     = lt;
            right    = rt;
        }

}