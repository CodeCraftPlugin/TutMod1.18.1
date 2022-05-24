get-childitem *.png
foreach { rename-item $_ $_.Name.Replace("orichalcum -", "steel") }