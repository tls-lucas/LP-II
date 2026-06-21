# LP-II — Sistema de Gerenciamento de Aquários (Java)

Este repositório contém o desenvolvimento de um projeto acadêmico realizado ao longo do semestre com foco no aprofundamento dos conceitos de Programação Orientada a Objetos (POO) utilizando a linguagem Java.

O sistema simula a gestão de um aquário: cadastro de animais aquáticos, atrações, escolas e passeios, com persistência dos dados em banco MySQL e interface gráfica desenvolvida com Swing.

## Objetivos

- Aplicar na prática os princípios de POO: encapsulamento, herança, polimorfismo e abstração (como na hierarquia entre `AnimalAquatico` e suas subclasses `Tubarão` e `Baleia`).
- Desenvolver habilidades de modelagem e organização de código, separando entidades, controladores, interfaces e persistência.
- Trabalhar com versionamento e colaboração em equipe.
- Explorar boas práticas de desenvolvimento em Java.

## Tecnologias utilizadas

- Java
- Swing (interfaces gráficas)
- MySQL (persistência)
- Maven
- Git/GitHub para controle de versão

## Estrutura do projeto

```
entidades/      Classes de domínio (Aquario, AnimalAquatico, Tubarão, Baleia, Escola, Passeio, Atração)
controles/      Controladores responsáveis pelas regras de negócio
interfaces/     Janelas e painéis da interface gráfica (Swing)
persistência/   Classe de acesso ao banco de dados
sql/            Script de criação do banco de dados
```

O projeto foi desenvolvido em etapas, com entregas parciais ao longo do semestre, refletindo a evolução dos aprendizados e da implementação.
