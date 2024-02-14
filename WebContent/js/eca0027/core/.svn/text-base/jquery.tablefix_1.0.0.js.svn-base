/*
 * jQuery TableFix plugin ver 1.0.0
 * Copyright (c) 2010 Otchy
 * This source file is subject to the MIT license.
 * http://www.otchy.net
 */
(function($){
	$.fn.tablefix = function(options) {
		return this.each(function(index){
			// 処理継続の判定
			var baseTable = $(this);
			var withWidth = (options.width > 0);
			var withHeight = (options.height > 0);
			if (withWidth) {
				withWidth = (options.width < baseTable.width());
			} else {
				options.width = baseTable.width();
			}
			if (withHeight) {
				withHeight = (options.height < baseTable.height());
			} else {
				options.height = baseTable.height();
			}
			if (withWidth || withHeight) {
				if (withWidth && withHeight) {
					options.width -= 40;
					options.height -= 40;
				} else if (withWidth) {
					options.width -= 20;
				} else {
					options.height -= 20;
				}
			} else {
			    baseTable.css({filter: 1});
				return;
			}
			// 外部 div の設定
			baseTable.wrap("<div class='all'></div>");
			var div = baseTable.parent();
			div.css({position: "relative"});
			// スクロール部オフセットの取得
			var fixRows = (options.fixRows > 0) ? options.fixRows : 0;
			var fixCols = (options.fixCols > 0) ? options.fixCols : 0;
			var offsetX = 0;
			var offsetY = 0;
			baseTable.find('tr').each(function(indexY) {
				$(this).find('td,th').each(function(indexX){
					if (indexY == fixRows && indexX == fixCols) {
						var cell = $(this);
						offsetX = cell.position().left;
						offsetY = cell.parent('tr').position().top;
						return false;
					}
				});
				if (indexY == fixRows) {
					return false;
				}
			});
			// ヘッダ用テーブルの作成
			var rowTableId = 'jquery_tablefix_' + new Date().getTime();
			var rowTableHtml = '<table id="' + rowTableId + '" class="' + baseTable.attr('class') + '">';
			baseTable.find('colgroup').each(function(idx) { rowTableHtml += $(this)[0].outerHTML });
			baseTable.find('tr:lt(' + fixRows + ')').each(function(idx) { rowTableHtml += $(this)[0].outerHTML; });
			rowTableHtml += '</table>';
			// ヘッダ用テーブルの追加
			baseTable.before('<div>' + rowTableHtml + '</div>');
			// オリジナルヘッダ行内のオブジェクトの無効化
			baseTable.find('tr:lt(' + fixRows + ')').find(':input').prop('disabled', true);
			//div.append('<div>' + rowTableHtml + '</div>');
			// テーブルの分割と初期化
			var rowTable = div.find('#' + rowTableId);
			var rowDiv = rowTable.parent().css({position: "absolute", overflow: "hidden"});
			var bodyTable = baseTable.wrap('<div></div>');
			var bodyDiv = bodyTable.parent().css({position: "absolute", overflow: "auto"});
			// クリップ領域の設定
			var bodyWidth = options.width - offsetX;
			var bodyHeight = options.height - offsetY;
			rowDiv
				.width(bodyWidth + (withWidth ? 20 : 0) + (withHeight ? 20 : 0))
				.height(offsetY)
				.css({left: offsetX + 'px'});
			rowTable.css({
				marginRight: (withWidth ? 20 : 0) + (withHeight ? 20 : 0) + 'px',
				filter: 1
			});
			bodyDiv
				.width(bodyWidth + (withWidth ? 20 : 0) + (withHeight ? 20 : 0))
				.height(bodyHeight + (withWidth ? 20 : 0) + (withHeight ? 20 : 0))
				.css({left: offsetX + 'px', top: offsetY + 'px'});
			bodyTable.css({
				marginTop: -offsetY + 'px',
				marginRight: (withWidth ? 20 : 0) + 'px',
				marginBottom: (withHeight ? 20 : 0) + 'px',
				filter: 1
			});
			if (withHeight) {
				rowTable.width(bodyTable.width());
			}
			// スクロール連動
			bodyDiv.scroll(function() {
				rowDiv.scrollLeft(bodyDiv.scrollLeft());
			});
			// 外部 div の設定
			div
				.width(options.width + (withWidth ? 20 : 0) + (withHeight ? 20 : 0))
				.height(options.height + (withWidth ? 20 : 0) + (withHeight ? 20 : 0));
		});
	}
})(jQuery);
