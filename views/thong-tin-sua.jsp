<%-- 
    Document   : thong-tin-sua
    Author     : hv
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div id="page2" class="main">
    <div class="col1 thuc-don">
        <%@include file="thuc-don.jsp"%>
    </div>
    <div class="col2">
        <table border="0" width="100%">
            <tr>
                <td colspan="2" class="tieu-de-sua">${dss}</td>
            </tr>
            <tr>
                <td><img src="./images/${s.hinh}"/></td>
                <td>
                    <p><b><i>Thành phần dinh dưỡng:</i></b><br>${s.tpDinhDuong}</p>
                    <p><b><i>Lợi ích:</i></b><br>${s.loiIch}</p>
                    <p><b><i>Trọng lượng:</i></b> ${s.trongLuong} - <b><i>Đơn giá:</i></b>${s.donGia}</p>
                </td>
            </tr>
        </table>
    </div>
</div>