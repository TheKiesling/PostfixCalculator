import java.util.ArrayList;
/**
 * Clase StackArrayList. Permite almacenar variables a manera de pila, implementando el modelo "First in, last out". Utiliza genericos.
 * @author Pablo Zamora
 * @version 18/02/2022
 */
public class StackArrayList<T> implements IStack<T> {

	private ArrayList<T> coreList; //ArrayList donde se almacenan las variables.
	
	/**
	 * Metodo constructor.
	 */
	public StackArrayList() {
		coreList = new ArrayList<T>();
	}
	
	/** 
	* Metodo push. Permite almacenar un valor en la posicion 0 del arrayList.
	* @param value Valor que se almacena.
	*/
	@Override
	public void push(T value) {		
		coreList.add(0, value);
	}

	/** 
	* Metodo pull. Permite obtener el valor en la posicion 0 del arrayList y eliminarlo de este.
	* @return Valor en la posicion 0.
	*/
	@Override
	public T pull() {
		return coreList.remove(0);
	}

	/**
	 * Metodo peek. Permite obtener el valor en la posicion 0 del arrayList sin eliminarlo.
	 * @return Valor en la posicion 0.
	 */
	@Override
	public T peek() {
		return coreList.get(0);
	}

	/**
	 * Metodo count. Permite obtener la cantidad de valores almacenados en el ArrayList.
	 * @return Tamano del arrayList.
	 */
	@Override
	public int count() {
		return coreList.size();
	}

	/**
	 * Metodo isEmpty. Permite determinar si el ArrayList esta vacio.
	 * @return Boolean. true si esta vacio, false si no lo esta.
	 */
	@Override
	public boolean isEmpty() {		
		return coreList.isEmpty();
	}

}
