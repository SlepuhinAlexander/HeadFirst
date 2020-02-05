If `String test = "No"`

    output:
    % java TestExceptions
    Begin try
    Begin dangerous method
    End dangerous method
    End try
    Finally
    End of main

----

if `String test = "Yes"`

    output:
    % java TestExceptions
    Begin try
    Begin dangerous method
    Scary exception
    Finally
    End of main
