import java.io.FileNotFoundException;

public class TestaException {
	public static void main(String[] args) {
		try {
			new java.io.FileInputStream("arquivo.txn");
		} catch (FileNotFoundException e) {
			System.out.println("Erro na abertuda do arquivo");
			e.printStackTrace();
		}
	}

	/*
	 * mais de um catch try { objeto.metodoQuePodeLancarIOeSQLException(); }
	 * catch (IOException e) { // .. } catch (SQLException e) { // .. }
	 */

	/*
	 * mais de um throws public void abre(String arquivo) throws IOException,
	 * SQLException {
	 */

	/*
	 * misturando try e throw public void abre(String arquivo) throws
	 * IOException { try { objeto.metodoQuePodeLancarIOeSQLException(); } catch
	 * (SQLException e) { // .. } }
	 */

}
