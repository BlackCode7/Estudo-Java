package orientacaoObjetosJava.orientacaoOBJ;

public class OrientacaoObjJavaClasse {

	public String stringObj = "Teste variável Java";	

	public String getStringObj() {
		return stringObj;
	}
	public void setStringObj(String stringObj) {
		this.stringObj = stringObj;
	}


	public String orientacaoObjMetodo(String stringVar) {
		// Transforma caracteres maiúsculos em caracteres minusculos 
		return stringVar.toLowerCase();
	}

}
