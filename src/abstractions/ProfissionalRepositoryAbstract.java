package abstractions;

import entities.Profissional;

public abstract class ProfissionalRepositoryAbstract {
	
	//atributo para armazenar o caminho do
	//diretório para onde os aquivos
	//serão exportados
	protected static final String PATH = "c:\\temp\\"; //CONSTANTE!
	
	//Método abstrato que deverá ser implementado
	//para realizar a exportação dos arquivos
	public abstract void exportar(Profissional profissional) throws Exception;
	
}
