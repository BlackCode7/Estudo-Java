package orientacaoObjetosJava.orientacaoOBJ;

public class OrientacaoObjJavaClasse {

	public String stringObj = "Teste vari�vel Java";	

	public String getStringObj() {
		return stringObj;
	}
	public void setStringObj(String stringObj) {
		this.stringObj = stringObj;
	}


	public String orientacaoObjMetodo(String stringVar) {
		// Transforma caracteres mai�sculos em caracteres minusculos 
		return stringVar.toLowerCase();
	}

}
