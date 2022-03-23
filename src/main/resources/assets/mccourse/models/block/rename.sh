get-childitem *.json
foreach { rename-item $_ $_.Name.Replace("orichalcum -", "steel") }