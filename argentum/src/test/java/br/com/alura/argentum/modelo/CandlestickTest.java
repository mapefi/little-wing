package br.com.alura.argentum.modelo;

import java.time.LocalDateTime;

import org.junit.Assert;
import org.junit.Test;

public class CandlestickTest {

	// @Test
	// public void test() {
	//
	// CandleBuilder builder = new CandleBuilder();
	// Candlestick candle =
	// builder.comAbertura(10.0).comFechamento(20.0).comMaximo(100.0).comMinimo(10.0)
	// .comVolume(100).comData(LocalDateTime.now()).geraCandle();
	// }

	@Test(expected = IllegalArgumentException.class)
	public void MaximoNaoDeveSerMenorDoQueMinimo() {

		LocalDateTime hoje = LocalDateTime.now();

		CandleBuilder builder = new CandleBuilder();
		Candle candle = builder.comAbertura(10.0).comFechamento(30.0).comMinimo(25.0).comMaximo(15.0)
				.comVolume(200.0).comData(hoje).geraCandle();

	}

	@Test
	public void ehAltaSeFechamentoForIgualAAbertura() {

		LocalDateTime hoje = LocalDateTime.now();

		CandleBuilder builder = new CandleBuilder();
		Candle candle = builder.comAbertura(30.0).comFechamento(30.0).comMinimo(10.0).comMaximo(50.0)
				.comVolume(200.0).comData(hoje).geraCandle();
		
		Assert.assertTrue(candle.isAlta());
	}

}
