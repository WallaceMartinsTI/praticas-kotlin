package desafios.intermediario

import java.time.Instant
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.ZoneId
import java.time.format.DateTimeFormatter

fun main() {
    print("Escolha uma opção:\n" +
            "[ 1 ] Data para Timestamp\n" +
            "[ 2 ] Timestamp para Data\n" +
            "[ 0 ] Sair\nOpção: ")

    val inputedOption = readln()

    try {
        var option = inputedOption.toInt()

        while(option !in (0..2)) {
            print("Opção inválida.\nOpção: ")
            option = readln().toInt()
        }

        when(option) {
            0 -> return
            1 -> {
                print("Informe a data no formato mês/dia/ano. Exemplo: 04/08/2024\nData: ")
                val date = readln()
                val timestampResult = dateToTimestamp(date)
                if(timestampResult != null) {
                    println("A data: $date, convertida para timestamp é: $timestampResult")
                } else {
                    println("A data informada não foi reconhecida.")
                    return
                }
            }
            2 -> {
                print("Informe o timestamp. Exemplo: 1718840360\nTimestmap: ")
                val inputedTimestmap = readln()

                val timestamp = try {
                    inputedTimestmap.toLong()
                } catch (e: Exception) {
                    e.printStackTrace()
                    null
                }

                var dateResult: String? = null
                if(timestamp != null) {
                    dateResult = timestampToDate(timestamp)
                }

                if(dateResult != null) {
                    println("O timestamp: $timestamp, convertida para data é: $dateResult")
                } else {
                    println("O timestamp informado não foi reconhecida.")
                    return
                }
            }
        }
    } catch (e: Exception) {
        e.printStackTrace()
    }

}

fun dateToTimestamp(dateString: String): Long? {
    val formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy")

    return try {
        val localDate = LocalDate.parse(dateString, formatter)
        val timestamp = localDate.atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli()
        timestamp
    } catch (e: Exception) {
        e.printStackTrace()
        null
    }
}

fun timestampToDate(timestamp: Long): String? {
    val instant = Instant.ofEpochMilli(timestamp)
    return try {
        val localDateTime = LocalDateTime.ofInstant(instant, ZoneId.systemDefault())
        val formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy")
        localDateTime.format(formatter)
    } catch (e: Exception) {
        e.printStackTrace()
        null
    }
}