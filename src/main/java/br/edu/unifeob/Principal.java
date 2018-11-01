package br.edu.unifeob;

import com.ubidots.ApiClient;
import com.ubidots.DataSource;
import com.ubidots.Variable;

public class Principal {

	public static void main(String[] args) {
		ApiClient client = new ApiClient("A1E-ed8f63f9dda07642896b35ba411e437f9240"); //Coloque_Aqui_Seu_Api_Key
		
		DataSource ds = client.getDataSource("5bda4fe9c03f97413ca5f543"); //Coloque aqui sua Dispositivo ID
		
		Variable[] vars = ds.getVariables();
		
		Variable ligado = vars[0];
		ligado.saveValue(1.0);
		
		System.out.println("Enviado");
	}
}
