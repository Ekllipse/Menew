package aplication;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ChaveValor;
import entities.enums.TipoCampo;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		String num_controles = "C:\\ConvertMYSQLtoFirebird\\Num_controle.txt";
		String path = "C:\\ConvertMYSQLtoFirebird\\MYSQL.csv";
		String path2 = "C:\\ConvertMYSQLtoFirebird\\FIREBIRDSCRIPT.SQL";

		ChaveValor vectCV[] = { new ChaveValor("NUM_CONTROLE", TipoCampo.NUMERO),
				new ChaveValor("NUMERO", TipoCampo.NUMERO), new ChaveValor("LETRA", TipoCampo.VARCHAR),
				new ChaveValor("STATUS", TipoCampo.NUMERO), new ChaveValor("MESA", TipoCampo.NUMERO),
				new ChaveValor("COMANDA", TipoCampo.NUMERO), new ChaveValor("GRUPO", TipoCampo.NUMERO),
				new ChaveValor("FONE", TipoCampo.VARCHAR), new ChaveValor("NOME", TipoCampo.VARCHAR),
				new ChaveValor("ENTREGADOR", TipoCampo.VARCHAR), new ChaveValor("data", TipoCampo.VARCHAR),
				new ChaveValor("HORA", TipoCampo.VARCHAR), new ChaveValor("GARCON", TipoCampo.VARCHAR),
				new ChaveValor("NPESSOAS", TipoCampo.VARCHAR), new ChaveValor("APARTAMENTO", TipoCampo.VARCHAR),
				new ChaveValor("DESCONTO", TipoCampo.NUMERO), new ChaveValor("TROCO", TipoCampo.NUMERO),
				new ChaveValor("DT_ABERTURA", TipoCampo.VARCHAR), new ChaveValor("HR_ABERTURA", TipoCampo.VARCHAR),
				new ChaveValor("DT_FECHAMENTO", TipoCampo.VARCHAR), new ChaveValor("HR_FECHAMENTO", TipoCampo.VARCHAR),
				new ChaveValor("FORMA", TipoCampo.VARCHAR), new ChaveValor("AVISO", TipoCampo.VARCHAR),
				new ChaveValor("ABERTO", TipoCampo.NUMERO), new ChaveValor("COD_VIP", TipoCampo.NUMERO),
				new ChaveValor("CAIXA", TipoCampo.NUMERO), new ChaveValor("DT_MOV", TipoCampo.VARCHAR),
				new ChaveValor("TN_MOV", TipoCampo.NUMERO), new ChaveValor("DT_FECHA", TipoCampo.VARCHAR),
				new ChaveValor("HR_FECHA", TipoCampo.VARCHAR), new ChaveValor("COO_PREVENDA", TipoCampo.VARCHAR),
				new ChaveValor("COO_CUPOM", TipoCampo.VARCHAR), new ChaveValor("ACRESCIMO", TipoCampo.NUMERO),
				new ChaveValor("TERMINAL", TipoCampo.NUMERO), new ChaveValor("TROCO_PARA", TipoCampo.NUMERO),
				new ChaveValor("HORA_SAIDA", TipoCampo.VARCHAR), new ChaveValor("TAXA", TipoCampo.VARCHAR),
				new ChaveValor("PONTOS", TipoCampo.NUMERO), new ChaveValor("VIP", TipoCampo.VARCHAR),
				new ChaveValor("TIPO_PAG", TipoCampo.VARCHAR), new ChaveValor("MSG", TipoCampo.VARCHAR),
				new ChaveValor("LANCTO_ORIGEM", TipoCampo.VARCHAR), new ChaveValor("CONSUMACAO", TipoCampo.NUMERO),
				new ChaveValor("LIB_CONSUMACAO", TipoCampo.VARCHAR), new ChaveValor("BX_ENTREGA", TipoCampo.VARCHAR),
				new ChaveValor("N_FABRICACAO", TipoCampo.VARCHAR), new ChaveValor("COD_FIDELIDADE", TipoCampo.NUMERO),
				new ChaveValor("VL_FIDELIDADE", TipoCampo.NUMERO), new ChaveValor("SALDO_FIDELIDADE", TipoCampo.NUMERO),
				new ChaveValor("FORMA_PAG", TipoCampo.NUMERO), new ChaveValor("OPERACAO", TipoCampo.VARCHAR),
				new ChaveValor("TEMPO_PEDIDO", TipoCampo.VARCHAR), new ChaveValor("NUM_CARTAO", TipoCampo.VARCHAR),
				new ChaveValor("VAL_CARTAO", TipoCampo.VARCHAR), new ChaveValor("CODIGO_SEG", TipoCampo.VARCHAR),
				new ChaveValor("HORA_PROG", TipoCampo.VARCHAR), new ChaveValor("CUPOM_DATA", TipoCampo.VARCHAR),
				new ChaveValor("CUPOM_HORA", TipoCampo.VARCHAR), new ChaveValor("N_FABRICACAO_CF", TipoCampo.VARCHAR),
				new ChaveValor("TIPO_DESCONTO", TipoCampo.NUMERO), new ChaveValor("NOTIFICACAO", TipoCampo.VARCHAR),
				new ChaveValor("COMPUTADOR", TipoCampo.NUMERO), new ChaveValor("DT_NASC", TipoCampo.VARCHAR),
				new ChaveValor("ENCOMENDA_DATA", TipoCampo.VARCHAR),
				new ChaveValor("ENCOMENDA_HORA", TipoCampo.VARCHAR), new ChaveValor("SENHA_DIGITADA", TipoCampo.NUMERO),
				new ChaveValor("FID_REF", TipoCampo.NUMERO), new ChaveValor("FID_CODIGO", TipoCampo.NUMERO),
				new ChaveValor("REG_IFOOD", TipoCampo.VARCHAR), new ChaveValor("TIPO_FORMA_PAG", TipoCampo.VARCHAR),
				new ChaveValor("TABELA", TipoCampo.NUMERO), new ChaveValor("SIF", TipoCampo.VARCHAR),
				new ChaveValor("PER_SERVICO", TipoCampo.NUMERO), new ChaveValor("CPF_IDENT", TipoCampo.VARCHAR),
				new ChaveValor("SALDO_PRE", TipoCampo.NUMERO), new ChaveValor("SALDO_POS", TipoCampo.NUMERO),
				new ChaveValor("INTEGRA", TipoCampo.VARCHAR), new ChaveValor("COD_IAPP", TipoCampo.VARCHAR),
				new ChaveValor("FID_CPF", TipoCampo.VARCHAR), new ChaveValor("CENTRO", TipoCampo.NUMERO),
				new ChaveValor("OBS_PAGTO", TipoCampo.VARCHAR), new ChaveValor("SINC_TEMP", TipoCampo.VARCHAR),
				new ChaveValor("INTG_TIPO", TipoCampo.VARCHAR), new ChaveValor("RECEBIDO_MOBILE", TipoCampo.VARCHAR),
				new ChaveValor("STATUS_ENTREGA", TipoCampo.NUMERO), new ChaveValor("ENTREGA_SAIDA", TipoCampo.VARCHAR),
				new ChaveValor("INTG_IDENTIFICADOR", TipoCampo.VARCHAR),
				new ChaveValor("INTG_PAGAMENTO", TipoCampo.VARCHAR),
				new ChaveValor("PRECONTA_NOTIF", TipoCampo.VARCHAR), new ChaveValor("ENTREGA_DATA", TipoCampo.VARCHAR),
				new ChaveValor("BX_ENTREGA_DATA", TipoCampo.VARCHAR),
				new ChaveValor("BX_ENTREGA_HORA", TipoCampo.VARCHAR),
				new ChaveValor("MOOVERY_STATUS", TipoCampo.VARCHAR), new ChaveValor("TRACKING", TipoCampo.VARCHAR),
				new ChaveValor("IDENTIFIER", TipoCampo.VARCHAR), new ChaveValor("DELIVERY_FEE", TipoCampo.NUMERO),
				new ChaveValor("DISTANCE", TipoCampo.NUMERO), new ChaveValor("LNG_DESTINATION", TipoCampo.VARCHAR),
				new ChaveValor("LAT_DESTINATION", TipoCampo.VARCHAR),
				new ChaveValor("DESCONTO_PROMO", TipoCampo.NUMERO), new ChaveValor("DESCONTO_DIG", TipoCampo.NUMERO),
				new ChaveValor("ENC_DATA", TipoCampo.VARCHAR), new ChaveValor("ENC_TURNO", TipoCampo.NUMERO),
				new ChaveValor("ENC_OPE", TipoCampo.NUMERO), new ChaveValor("INTG_TAXA", TipoCampo.NUMERO),
				new ChaveValor("INTG_ENTREGA", TipoCampo.VARCHAR), new ChaveValor("ANIV_IDENT", TipoCampo.VARCHAR),
				new ChaveValor("ANIV_PROD", TipoCampo.NUMERO), new ChaveValor("DESCONTO_MARKETPLACE", TipoCampo.NUMERO),
				new ChaveValor("FANTASIA", TipoCampo.VARCHAR), new ChaveValor("PAINEL", TipoCampo.NUMERO),
				new ChaveValor("PAINEL_DATA", TipoCampo.VARCHAR), new ChaveValor("PAINEL_HORA", TipoCampo.VARCHAR),
				new ChaveValor("DELIVERED_BY", TipoCampo.VARCHAR),
				new ChaveValor("DESCONTO_DIG_TIPO", TipoCampo.NUMERO), new ChaveValor("VIA", TipoCampo.NUMERO),
				new ChaveValor("ANEXO", TipoCampo.NUMERO), new ChaveValor("PAGAMENTO_ONLINE", TipoCampo.VARCHAR),
				new ChaveValor("ID_MARKETPLACE", TipoCampo.VARCHAR), new ChaveValor("NOME_IDENT", TipoCampo.VARCHAR),
				new ChaveValor("DESCONTO_DIG_IDENT", TipoCampo.VARCHAR),
				new ChaveValor("EXTERNAL_CARD", TipoCampo.VARCHAR),

		};
		List<String> listSQL = new ArrayList<>();
		List<String> numControle = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String linhaOut = br.readLine();
			String linha[] = linhaOut.split(",");

			for (int i = 0; i < vectCV.length; i++) {
				for (int j = 0; j < linha.length; j++) {
					if (vectCV[i].getCampo().toLowerCase().equals(linha[j])) {
						vectCV[i].setPosicao(j);
					}
				}
			}
			linhaOut = br.readLine();

			while (linhaOut != null) {
				linha = linhaOut.split(",");
				linhaOut = br.readLine();
				for (int i = 0; i < vectCV.length; i++) {
					for (int j = 0; j < linha.length; j++)
						vectCV[i].setValor(linha[vectCV[i].getPosicao()]);

				}

				listSQL.add("INSERT INTO TBCABCONTA(" + vectCV[0].getCampo() + "," + vectCV[1].getCampo()
						+ "," + vectCV[2].getCampo() + "," + vectCV[3].getCampo() + "," + vectCV[4].getCampo() + ","
						+ vectCV[5].getCampo() + "," + vectCV[6].getCampo() + "," + vectCV[7].getCampo() + ","
						+ vectCV[8].getCampo() + "," + vectCV[9].getCampo() + "," + vectCV[10].getCampo() + ","
						+ vectCV[11].getCampo() + "," + vectCV[12].getCampo() + "," + vectCV[13].getCampo() + ","
						+ vectCV[14].getCampo() + "," + vectCV[15].getCampo() + "," + vectCV[16].getCampo() + ","
						+ vectCV[17].getCampo() + "," + vectCV[18].getCampo() + "," + vectCV[19].getCampo() + ","
						+ vectCV[20].getCampo() + "," + vectCV[21].getCampo() + "," + vectCV[22].getCampo() + ","
						+ vectCV[23].getCampo() + "," + vectCV[24].getCampo() + "," + vectCV[25].getCampo() + ","
						+ vectCV[26].getCampo() + "," + vectCV[27].getCampo() + "," + vectCV[28].getCampo() + ","
						+ vectCV[29].getCampo() + "," + vectCV[30].getCampo() + "," + vectCV[31].getCampo() + ","
						+ vectCV[32].getCampo() + "," + vectCV[33].getCampo() + "," + vectCV[34].getCampo() + ","
						+ vectCV[35].getCampo() + "," + vectCV[36].getCampo() + "," + vectCV[37].getCampo() + ","
						+ vectCV[38].getCampo() + "," + vectCV[39].getCampo() + "," + vectCV[40].getCampo() + ","
						+ vectCV[41].getCampo() + "," + vectCV[42].getCampo() + "," + vectCV[43].getCampo() + ","
						+ vectCV[44].getCampo() + "," + vectCV[45].getCampo() + "," + vectCV[46].getCampo() + ","
						+ vectCV[47].getCampo() + "," + vectCV[48].getCampo() + "," + vectCV[49].getCampo() + ","
						+ vectCV[50].getCampo() + "," + vectCV[51].getCampo() + "," + vectCV[52].getCampo() + ","
						+ vectCV[53].getCampo() + "," + vectCV[54].getCampo() + "," + vectCV[55].getCampo() + ","
						+ vectCV[56].getCampo() + "," + vectCV[57].getCampo() + "," + vectCV[58].getCampo() + ","
						+ vectCV[59].getCampo() + "," + vectCV[60].getCampo() + "," + vectCV[61].getCampo() + ","
						+ vectCV[62].getCampo() + "," + vectCV[63].getCampo() + "," + vectCV[64].getCampo() + ","
						+ vectCV[65].getCampo() + "," + vectCV[66].getCampo() + "," + vectCV[67].getCampo() + ","
						+ vectCV[68].getCampo() + "," + vectCV[69].getCampo() + "," + vectCV[70].getCampo() + ","
						+ vectCV[71].getCampo() + "," + vectCV[72].getCampo() + "," + vectCV[73].getCampo() + ","
						+ vectCV[74].getCampo() + "," + vectCV[75].getCampo() + "," + vectCV[76].getCampo() + ","
						+ vectCV[77].getCampo() + "," + vectCV[78].getCampo() + "," + vectCV[79].getCampo() + ","
						+ vectCV[80].getCampo() + "," + vectCV[81].getCampo() + "," + vectCV[82].getCampo() + ","
						+ vectCV[83].getCampo() + "," + vectCV[84].getCampo() + "," + vectCV[85].getCampo() + ","
						+ vectCV[86].getCampo() + "," + vectCV[87].getCampo() + "," + vectCV[88].getCampo() + ","
						+ vectCV[89].getCampo() + "," + vectCV[90].getCampo() + "," + vectCV[91].getCampo() + ","
						+ vectCV[92].getCampo() + "," + vectCV[93].getCampo() + "," + vectCV[94].getCampo() + ","
						+ vectCV[95].getCampo() + "," + vectCV[96].getCampo() + "," + vectCV[97].getCampo() + ","
						+ vectCV[98].getCampo() + "," + vectCV[99].getCampo() + "," + vectCV[100].getCampo() + ","
						+ vectCV[101].getCampo() + "," + vectCV[102].getCampo() + "," + vectCV[103].getCampo() + ","
						+ vectCV[104].getCampo() + "," + vectCV[105].getCampo() + "," + vectCV[106].getCampo() + ","
						+ vectCV[107].getCampo() + "," + vectCV[108].getCampo() + "," + vectCV[109].getCampo() + ","
						+ vectCV[110].getCampo() + "," + vectCV[111].getCampo() + "," + vectCV[112].getCampo() + ","
						+ vectCV[113].getCampo() + "," + vectCV[114].getCampo() + "," + vectCV[115].getCampo() + ","
						+ vectCV[116].getCampo() + "," + vectCV[117].getCampo() + "," + vectCV[118].getCampo() + ","
						+ vectCV[119].getCampo() + "," + vectCV[120].getCampo() + "," + vectCV[121].getCampo() + ")"
						+ "VALUES (" + vectCV[0].getValor() + "," + vectCV[1].getValor() + "," + vectCV[2].getValor()
						+ "," + "964" + "," + vectCV[4].getValor() + "," + vectCV[5].getValor() + ","
						+ vectCV[6].getValor() + "," + vectCV[7].getValor() + "," + vectCV[8].getValor() + ","
						+ vectCV[9].getValor() + "," + vectCV[10].getValor() + "," + vectCV[11].getValor() + ","
						+ vectCV[12].getValor() + "," + vectCV[13].getValor() + "," + vectCV[14].getValor() + ","
						+ vectCV[15].getValor() + "," + vectCV[16].getValor() + "," + vectCV[17].getValor() + ","
						+ vectCV[18].getValor() + "," + vectCV[19].getValor() + "," + vectCV[20].getValor() + ","
						+ vectCV[21].getValor() + "," + vectCV[22].getValor() + "," + vectCV[23].getValor() + ","
						+ vectCV[24].getValor() + "," + vectCV[25].getValor() + "," + vectCV[26].getValor() + ","
						+ vectCV[27].getValor() + "," + vectCV[28].getValor() + "," + vectCV[29].getValor() + ","
						+ vectCV[30].getValor() + "," + vectCV[31].getValor() + "," + vectCV[32].getValor() + ","
						+ vectCV[33].getValor() + "," + vectCV[34].getValor() + "," + vectCV[35].getValor() + ","
						+ vectCV[36].getValor() + "," + vectCV[37].getValor() + "," + vectCV[38].getValor() + ","
						+ vectCV[39].getValor() + "," + vectCV[40].getValor() + "," + vectCV[41].getValor() + ","
						+ vectCV[42].getValor() + "," + vectCV[43].getValor() + "," + vectCV[44].getValor() + ","
						+ vectCV[45].getValor() + "," + vectCV[46].getValor() + "," + vectCV[47].getValor() + ","
						+ vectCV[48].getValor() + "," + vectCV[49].getValor() + "," + vectCV[50].getValor() + ","
						+ vectCV[51].getValor() + "," + vectCV[52].getValor() + "," + vectCV[53].getValor() + ","
						+ vectCV[54].getValor() + "," + vectCV[55].getValor() + "," + vectCV[56].getValor() + ","
						+ vectCV[57].getValor() + "," + vectCV[58].getValor() + "," + vectCV[59].getValor() + ","
						+ vectCV[60].getValor() + "," + vectCV[61].getValor() + "," + vectCV[62].getValor() + ","
						+ vectCV[63].getValor() + "," + vectCV[64].getValor() + "," + vectCV[65].getValor() + ","
						+ vectCV[66].getValor() + "," + vectCV[67].getValor() + "," + vectCV[68].getValor() + ","
						+ vectCV[69].getValor() + "," + vectCV[70].getValor() + "," + vectCV[71].getValor() + ","
						+ vectCV[72].getValor() + "," + vectCV[73].getValor() + "," + vectCV[74].getValor() + ","
						+ vectCV[75].getValor() + "," + vectCV[76].getValor() + "," + vectCV[77].getValor() + ","
						+ vectCV[78].getValor() + "," + vectCV[79].getValor() + "," + vectCV[80].getValor() + ","
						+ vectCV[81].getValor() + "," + vectCV[82].getValor() + "," + vectCV[83].getValor() + ","
						+ vectCV[84].getValor() + "," + vectCV[85].getValor() + "," + vectCV[86].getValor() + ","
						+ vectCV[87].getValor() + "," + vectCV[88].getValor() + "," + vectCV[89].getValor() + ","
						+ vectCV[90].getValor() + "," + vectCV[91].getValor() + "," + vectCV[92].getValor() + ","
						+ vectCV[93].getValor() + "," + vectCV[94].getValor() + "," + vectCV[95].getValor() + ","
						+ vectCV[96].getValor() + "," + vectCV[97].getValor() + "," + vectCV[98].getValor() + ","
						+ vectCV[99].getValor() + "," + vectCV[100].getValor() + "," + vectCV[101].getValor() + ","
						+ vectCV[102].getValor() + "," + vectCV[103].getValor() + "," + vectCV[104].getValor() + ","
						+ vectCV[105].getValor() + "," + vectCV[106].getValor() + "," + vectCV[107].getValor() + ","
						+ vectCV[108].getValor() + "," + vectCV[109].getValor() + "," + vectCV[110].getValor() + ","
						+ vectCV[111].getValor() + "," + vectCV[112].getValor() + "," + vectCV[113].getValor() + ","
						+ vectCV[114].getValor() + "," + vectCV[115].getValor() + "," + vectCV[116].getValor() + ","
						+ vectCV[117].getValor() + "," + vectCV[118].getValor() + "," + vectCV[119].getValor() + ","
						+ vectCV[120].getValor() + "," + vectCV[121].getValor() + ");");
						
						numControle.add(vectCV[0].getValor());
			}

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path2))) {
			for (String x : listSQL) {
				bw.write(x);
				bw.newLine();

			}
			

			System.out.println("***ARQUIVO GERADO!***");

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		try (BufferedWriter bw2 = new BufferedWriter( new FileWriter(num_controles))){
			String textControl = "";
			for(String x : numControle) {
				textControl += x + ",";
			}
			textControl = "select * from tbcabconta where num_controle in (" + textControl + ")";
			if(textControl.contains(",)")) {
				textControl = textControl.replace(",)", ")");
				System.out.println(textControl);
			}
			bw2.write( textControl);

		}catch(IOException e) {
			System.out.println("irm?o deu erro: " + e.getMessage());
		}
		

		sc.close();

	}

}
