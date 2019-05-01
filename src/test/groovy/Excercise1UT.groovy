import spock.lang.Specification

class Excercise1UT extends Specification{

    def input = ["lion", "elephant", "crocodile", "Capybara"] as String[]
    def inputInts = [12, 35, 43, 3, 56, -12]

    def "task1 test"() {
        given:
        def expectedOutput = ["crocodile", "Capybara"]
        Excercise1 e1 = new Excercise1()

        when:
        def output = e1.task1(input)
        then:
        output == expectedOutput

    }

    def "task2 test"() {
        given:
        def expectedOutput = "crocodile"
        Excercise1 e1 = new Excercise1()

        when:
        def output = e1.task2(input)
        then:
        output == expectedOutput
    }

    def "task3 test"() {
        given:
        def expectedOutput = ["lion", "elephant", "Capybara"]
        Excercise1 e1 = new Excercise1()

        when:
        def output = e1.task3(input)
        then:
        output == expectedOutput
    }

    def "task4 test"() {
        given:
        def expectedOutput = ["noil", "tnahpele", "elidocorc", "arabypaC"]
        Excercise1 e1 = new Excercise1()

        when:
        def output = e1.task4(input)
        then:
        output == expectedOutput
    }

    def "task5 test"() {
        given:
        def expectedOutput = 29
        Excercise1 e1 = new Excercise1()

        when:
        def output = e1.task5(input)
        then:
        output == expectedOutput
    }

    def "task6 test"() {
        given:
        def expectedOutput = 7.25
        Excercise1 e1 = new Excercise1()

        when:
        def output = e1.task6(input)
        then:
        output == expectedOutput
    }

    def "task7 test"() {
        given:
        def expectedOutput = "e12,o35,o43,o3,e56,e-12"
        Excercise1 e1 = new Excercise1()

        when:
        def output = e1.task7(inputInts)
        then:
        output == expectedOutput
    }

    def "task8 test"() {
        given:
        def expectedOutput = ["+12+", "+35+", "+43+", "+3+", "+56+", "+-12+"]
        Excercise1 e1 = new Excercise1()

        when:
        def output = e1.task8(inputInts)
        then:
        output == expectedOutput
    }
}
