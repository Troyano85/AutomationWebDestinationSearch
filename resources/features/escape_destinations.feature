Feature: choose destination
  user can choose the destination for his trip

  @escape_destinations
  Scenario Outline: user wants to choose the type of getaway for his trip
    Given  user is on the getaways page
    When  user selects the <icon>
    Then user sees the <result>
    Examples:
      | icon      | result                                       |
      | 'Cultura' | 'Ibagué: descubre los secretos de la ciudad' |
      | 'Montaña' | 'Ibagué: descubre los secretos de la ciudad' |
      | 'Ciudad'  | 'Ibagué: descubre los secretos de la ciudad' |

