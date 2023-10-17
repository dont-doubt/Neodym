@if "%~1" == "" goto usage
git add -A
git commit -m %1
git push
@echo.
@exit

:usage
@echo ^>^>^> Usage: gitpush "commit description"
@echo.