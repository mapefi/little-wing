package br.com.alura.argentum.modelo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class CandleFactory {
	
	public Candle gerarCandleParaData(List<Negociacao> negociacoes, LocalDateTime data){
	
		double abertura = negociacoes.isEmpty() ? 0 : negociacoes.get(0).getPreco();
		double fechamento = negociacoes.isEmpty() ? 0 : negociacoes.get(negociacoes.size() - 1).getPreco();
		double minimo = negociacoes.isEmpty() ? 0 : negociacoes.get(0).getPreco();
		double maximo = negociacoes.isEmpty() ? 0 : negociacoes.get(0).getPreco();
		double volume = 0;
		
		for (Negociacao negociacao : negociacoes){
			volume += negociacao.getVolume();
			
			double preco = negociacao.getPreco();
			if (preco > maximo){
				maximo = preco;
			}
			else if (preco < minimo){
				minimo = preco;		}
		}
		
		return new Candle(abertura, fechamento, maximo, minimo, volume, data);
	}

	public List<Candle> constroiCandles(List<Negociacao> negociacoes) {

		List<Candle> candlesticks = new ArrayList<>();
		
		List<Negociacao> negociacoesDoDia = new ArrayList<>();
		
		LocalDateTime dataAtual = negociacoes.get(0).getData();
		
		for (Negociacao negociacao : negociacoes) {
			
			if(negociacao.isMesmoDia(dataAtual)){
				negociacoesDoDia.add(negociacao);
			}else{
				geraAdicionaCandle(candlesticks, negociacoesDoDia, dataAtual);
				negociacoesDoDia = new ArrayList<>();
				dataAtual = negociacao.getData();
			}
			
		}
		
		geraAdicionaCandle(candlesticks, negociacoesDoDia, dataAtual);
		
		return candlesticks;
		
	}

	private void geraAdicionaCandle(List<Candle> candlesticks, List<Negociacao> negociacoesDoDia, LocalDateTime dataAtual) {
		Candle candle = gerarCandleParaData(negociacoesDoDia, dataAtual);
		candlesticks.add(candle);
	}

}
