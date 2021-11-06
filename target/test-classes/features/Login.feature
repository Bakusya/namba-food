Feature: Namba Food Login

  Background:
    Given Я как пользователь должен зайти на сайт nambafood

  @Test1
  Scenario: Я как пользователь должен войти в систему с валидными данными
    Given Пользователь должен нажать на кнопку ВОЙТИ
    When Пользователь войдет в систему с этими данными
      | username                     | password  |
      | baktygulakimbekova@gmail.com | Aseinova8 |
    Then Пользователь должен успешно войти в систему


  Scenario:  Пользователь должен ввести не правильные данные и должен увидеть ошибку
    Given Пользователь должен нажать на кнопку ВОЙТИ
    When Пользователь войдет в систему с этими данными
      | username        | password    |
      | elonm@gmail.com | elonmask123 |
    Then Пользователь должен увидеть ошибку "Неправильные email и/или пароль"


