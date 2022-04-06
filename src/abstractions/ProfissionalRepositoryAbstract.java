package abstractions;

import entities.Profissional;

public abstract class ProfissionalRepositoryAbstract {
	
	//atributo para armazenar o caminho do
	//diret�rio para onde os aquivos
	//ser�o exportados
	protected static final String PATH = "c:\\temp\\"; //CONSTANTE!
	
	//M�todo abstrato que dever� ser implementado
	//para realizar a exporta��o dos arquivos
	public abstract void exportar(Profissional profissional) throws Exception;
	
}
