import spock.lang.Specification

class Exercise2UT extends Specification{

    def inputInts = [1, 5, 4, 5, 1, 6] as int[]

    def "task1 test"() {
        given:
        def expectedOutput = [1:2, 4:1, 5:2, 6:1]
        Exercise2 e2 = new Exercise2()

        when:
        def output = e2.task1(inputInts)
        then:
        output == expectedOutput

    }

    def "task2 test"() {
        given:
        def expectedOutput = 600
        Exercise2 e2 = new Exercise2()

        when:
        def output = e2.task2(inputInts)
        then:
        output == expectedOutput

    }

    def "task3 test"() {
        given:
        Exercise2 e2 = new Exercise2()

        expect:
        result == e2.task3(input)

        where:
        input | result
        0     | 1
        1     | 1
        2     | 2
        3     | 6
        4     | 24
        9     | 362880

    }

    def "task4 test"() {
        given:
        Exercise2 e2 = new Exercise2()

        expect:
        result == e2.task4(input)

        where:
        result | input
        true   | [0] as int[]
        false  | [1] as int[]
        true   | [7, 49, 14, 0] as int[]
    }

    def "task5 test"() {
        given:
        Exercise2 e2 = new Exercise2()

        expect:
        result == e2.task5(input)

        where:
        result | input
        4      | [["SZłA", "dzieweczka"], ["do", "laseczka"]] as String[][]
    }
}
