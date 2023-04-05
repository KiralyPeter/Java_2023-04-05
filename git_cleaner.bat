@echo off

rem GIT alaphelyzetre allitas

git config --global --unset user.name
git config --global --unset user.email
cmdkey /delete git:https://github.com

git config --global user.name
git config --global user.email

pause


