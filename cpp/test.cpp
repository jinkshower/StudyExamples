#include <iostream>

int main () 
{
    int userInput;
    std::cout<<"Enter your favorite number between 1 and 100: ";
    std::cin>>userInput;
    std::cout<<"No really " << userInput << " is my favorite" << std::endl;

    return 0;
}