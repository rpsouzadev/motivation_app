package com.example.motivation.data

import com.example.motivation.infra.MotivationConstants
import kotlin.random.Random

data class Phrase(val description: String, val categoryId: Int)

class Mock {
    private val all = MotivationConstants.FILTER.ALL
    private val emoji = MotivationConstants.FILTER.EMOJI
    private val sunny = MotivationConstants.FILTER.SUNNY

    private val listPhrase = listOf<Phrase>(
        Phrase("Não sabendo que era impossível, foi lá e fez.", emoji),
        Phrase("Você não é derrotado quando perde, você é derrotado quando desiste!", emoji),
        Phrase("Quando está mais escuro, vemos mais estrelas!", emoji),
        Phrase("Insanidade é fazer sempre a mesma coisa e esperar um resultado diferente.", emoji),
        Phrase("Não pare quando estiver cansado, pare quando tiver terminado.", emoji),
        Phrase("O que você pode fazer agora que tem o maior impacto sobre o seu sucesso?", emoji),
        Phrase("A melhor maneira de prever o futuro é inventá-lo.", sunny),
        Phrase("Você perde todas as chances que você não aproveita.", sunny),
        Phrase("Fracasso é o condimento que dá sabor ao sucesso.", sunny),
        Phrase("Enquanto não estivermos comprometidos, haverá hesitação!", sunny),
        Phrase("Se você não sabe onde quer ir, qualquer caminho serve.", sunny),
        Phrase("Se você acredita, faz toda a diferença.", sunny),
        Phrase("Riscos devem ser corridos, porque o maior perigo é não arriscar nada!", sunny)
    )

    fun getPhrase(selectedId: Int): String {

        val filtered = listPhrase.filter { (it.categoryId == selectedId || selectedId == all) }
        val index = Random.nextInt(filtered.size)
        return filtered[index].description
    }
}