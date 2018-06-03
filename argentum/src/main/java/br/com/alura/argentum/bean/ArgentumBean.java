package br.com.alura.argentum.bean;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.model.chart.LineChartModel;

import br.com.alura.argentum.graficos.GeradorDeModeloGrafico;
import br.com.alura.argentum.indicadores.IndicadorFactory;
import br.com.alura.argentum.modelo.Candle;
import br.com.alura.argentum.modelo.CandleFactory;
import br.com.alura.argentum.modelo.Negociacao;
import br.com.alura.argentum.modelo.SerieTemporal;
import br.com.alura.argentum.ws.ClientWebservice;

@ViewScoped
@ManagedBean
public class ArgentumBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<Negociacao> negociacoes;
	private LineChartModel modeloGrafico;
	private String nomeMedia;
	private String nomeIndicadorBase;

	public ArgentumBean() {
		this.negociacoes = new ClientWebservice().getNegociacoes();

		geraGrafico();

		// this.modeloGrafico = new LineChartModel();
		// this.modeloGrafico.setTitle("Meu Primeiro Gráfico");
		// this.modeloGrafico.setLegendPosition("w");
		//
		// LineChartSeries linha = new LineChartSeries();
		// linha.setLabel("Valores");
		// linha.set(1, 10.5);
		// linha.set(2, 13.0);
		// linha.set(3, 12.0);
		// this.modeloGrafico.addSeries(linha);

	}

	
	public void geraGrafico() {
		System.out.println("PLOTANDO: " + nomeMedia + " de " + nomeIndicadorBase);
		List<Candle> candles = new CandleFactory().constroiCandles(negociacoes);
		SerieTemporal serie = new SerieTemporal(candles);

		GeradorDeModeloGrafico geradorModelo = new GeradorDeModeloGrafico(serie, 2, serie.getUltimaPosical());
		IndicadorFactory fabrica = new IndicadorFactory(nomeMedia, nomeIndicadorBase);
		geradorModelo.plotaIndicador(fabrica.defineIndicador());
		this.modeloGrafico = geradorModelo.getModeloGrafico();
	}
	

	public LineChartModel getModeloGrafico() {
		return modeloGrafico;
	}

	public List<Negociacao> getNegociacoes() {
		return this.negociacoes;
	}

	public String getNomeMedia() {
		return nomeMedia;
	}

	public void setNomeMedia(String nomeMedia) {
		this.nomeMedia = nomeMedia;
	}

	public String getNomeIndicadorBase() {
		return nomeIndicadorBase;
	}

	public void setNomeIndicadorBase(String nomeIndicadorBase) {
		this.nomeIndicadorBase = nomeIndicadorBase;
	}

}
