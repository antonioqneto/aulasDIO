## Java Version Management

jabba

## Comandos utilizados

### Jabba
    jabba ls-remote //lista versões de jdk instaladas  
    jabba install openjdk@1.11 //instala implementação desejada  
    jabba use openjdk@1.11  
    java -version  
    
#### Instalação

    [Net.ServicePointManager]::SecurityProtocol = [Net.SecurityProtocolType]::Tls12
Invoke-Expression (
  Invoke-WebRequest https://github.com/shyiko/jabba/raw/master/install.ps1 -UseBasicParsing
).Content

## Compilaçao

    javac -d target/ -sourcepath FILEPATHHERE

## Documentação

Utilizando o OpenJdk é possível gerar a documentação em HTML através do comando javadoc

    javadoc -d javadoc/ -sourcepath src/ -subpackages com.dio

* javac - java compiler

* -d - diretorio

* -sourcepath - 

## Modificadores de acesso

* *public* - Qualquer classe de qualquer pacote pode acessar o método/atributo.

* *protected* - Qualquer classe definida no mesmo pacote/subclasse.

* *private* - Apenas a própria classe.

* Sem modificador - Apenas classes definidas no mesmo pacote.

## Métodos

São funções que definem o comportamento de uma classe

### Métodos Construtores

Definem como uma classe será instanciada.

### Métodos comuns

Definem comportamentos que estão ou não atribuídos às regras de negócio.

# Tags Javadoc

Estão aplicadas no exemplo2.java

* @author
Especifica o autor da classe ou método
* @deprecated 
Indica classes ou métodos obsoletos
* @link
Indica URL para outro documento
* @param
Descreve um parâmetro que será passado a um método
* @return
Descreve o retorno de um método
* @see
Associa a outras classes ou métodos
* @since
Desde quando foi adicionado
* @throws
Descreve exceções que podem ser lançadas por um método
* @version
Descreve a versão da classe ou método
